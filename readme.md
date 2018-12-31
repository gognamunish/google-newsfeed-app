# google-newsfeed-app

This app uses Google News API to generate a constantly updating Google Spreadsheet on company-specific articles.

Application uses file based H2 database to store all the companies that are configured for articles.

On start up app creates a new Sheet and stores the sheet Id for any subsequent requests.

Once news are fetched from newsapi.org they are written to the google spreadsheet in a dedicated tab.

### View all Companies
GET /companies

### Add a new Company
POST /companies/{name}

### Delete existing Company
DELETE /companies/{name}
 
 
## Running Application
```java
java NewsFeedAppMain
``` 

## Stack
- Java 1.8
- Spring Boot
- Lombok 
- H2


