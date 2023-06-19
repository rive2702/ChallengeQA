import {test, expect} from '@playwright/test'

test('Order flow', async ({page}) => {

    //Login
    await page.goto('https://saucedemo.com/v1')
    await page.getByRole('textbox', {name: 'Username'}).fill('standard_user')
    await page.getByRole('textbox', {name: 'Password'}).fill('secret_sauce')
    await page.getByRole('button', {name: 'Login'}).click()

    //Picking product/s
    const itemsContainer = await page.locator('#inventory_container .inventory_list .inventory_item').all()
    const randomIndex = Math.floor(Math.random() * itemsContainer.length)
    const randomItem = itemsContainer[randomIndex]
    

    const expectedDesc = await randomItem.locator('.inventory_item_desc').innerText()
    const expectedName = await randomItem.locator('.inventory_item_name').innerText()
    const expectedPrice = await randomItem.locator('.inventory_item_price').innerText()

    await randomItem.getByRole('button', {name: 'Add to cart'}).click()
    await page.locator('a.shopping_cart_link').click()

    //Checkout page
    const actualDesc = await page.locator('.inventory_item_desc').innerText()
    const actualName = await page.locator('.inventory_item_name').innerText()
    const actualPrice = await page.locator('.inventory_item_price').innerText()
    
    await expect(page.getByRole('link', {name: 'CHECKOUT'})).toBeVisible()
    
    expect(actualDesc).toEqual(expectedDesc)
    expect(actualName).toEqual(expectedName)
    expect('$'+actualPrice).toEqual(expectedPrice)

    await page.getByRole('link', {name: 'CHECKOUT'}).click()

    //Checkout page: ordering info
    await expect(page.getByRole('button', {name: 'CONTINUE'})).toBeVisible()
    await page.getByRole('textbox', {name: 'First Name'}).fill('Pablo')
    await page.getByRole('textbox', {name: 'Last Name'}).fill('Rivera')
    await page.getByRole('textbox', {name: 'Zip/Postal Code'}).fill('170120')
    await page.getByRole('button', {name: 'CONTINUE'}).click()

    //Finish page
    await expect(page.getByRole('link', {name: 'FINISH'})).toBeVisible()
    await page.getByRole('link', {name: 'FINISH'}).click()

    await expect(page.getByRole('heading', {name: 'Thank you for your order'})).toBeVisible()
    //await page.pause()    
});