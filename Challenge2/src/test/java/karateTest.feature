Feature: QA Challenge 2
  Scenario: Paso 1 - Add new pet
  Given url 'https://petstore.swagger.io/v2/pet'
    When request
    """
{
  "id": 2728,
  "category": {
    "id": 2728,
    "name": "dogs"
  },
  "name": "LUNA2728",
  "photoUrls": [
    "string"
  ],
  "tags": [
    {
      "id": 2728,
      "name": "LUNA2728"
    }
  ],
  "status": "available"
}
    """
    And method POST
    Then status 200

  Scenario: Paso 2 - Get new pet
    Given url 'https://petstore.swagger.io/v2/pet/2728'
    When method GET
    Then status 200
    And match response.id == 2728

  Scenario: Paso 3 - Update new pet
    Given url 'https://petstore.swagger.io/v2/pet'
    When request
    """
{
  "id": 2728,
  "category": {
    "id": 2728,
    "name": "dogs"
  },
  "name": "MAYA2728",
  "photoUrls": [
    "string"
  ],
  "tags": [
    {
      "id": 2728,
      "name": "MAYA2728"
    }
  ],
  "status": "sold"
}
    """
    And method PUT
    Then status 200

  Scenario: Paso 4 - Get updated new pet by status
    Given url 'https://petstore.swagger.io/v2/pet/findByStatus?status=sold'
    When method GET
    Then status 200
    And match response[?(@.id==2728)].status == ["sold"]