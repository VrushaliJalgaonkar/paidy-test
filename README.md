# Paidy Take-Home assignment Solution
This repository has solution of Paidy test provided at https://github.com/paidy/interview/blob/master/Forex.md

## Assumptions/Limitations
- The service returns an exchange rate when provided with 2 supported currencies
- The rate should not be older than 5 minutes. 
- The service should support at least 10,000 successful requests per day with 1 API token. But the One-Frame service supports a maximum of 1000 requests per day for any given authentication token.


## Implementation details
- To handle 10,000 requests, caching the data solution can be added.
- Updated code in Currency.scala file to make a list pair of all currencies and added a trait to handle the currency names to be uppercase letters.
- Improved logging by adding highligting to the log messages.


## Build and run the code
> sbt compile  
> sbt run


## Future Improvements
- Tests can be added
- Swagger UI can be added, to help other developers to understand the APIs working
- Logging can be improved. For example, the logs can be preserved in files. When the logs size increses, then it can be moved to a file. This can be done by updating logback.xml file


