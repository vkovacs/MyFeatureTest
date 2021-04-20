Feature: echo can be retrieved
  Scenario: client makes call for Hello world!
    When the client calls http://urlecho.appspot.com/echo?status=200&Content-Type=text%2Fhtml&body=Hello%20world!
    Then the client receives status code of 200
    And result is Hello world!