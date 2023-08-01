# Stock-Management-System

This project is aimed at creating the basic design of the backend of Stock Management. This Readme.md file will guide you through the project setup, the models used, and the API endpoints available.

>### Prerequisites
* ![MySql](https://img.shields.io/badge/DBMS-MYSQL%205.7%20or%20Higher-red)
 * ![SpringBoot](https://img.shields.io/badge/Framework-SpringBoot-green)


* ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

>## Installation

To run this application locally, you will need to have Java and MySQL installed on your machine.

* Clone the repository to your local machine.
* Create a new MySQL database called `Mapping`
* Update the `application.properties` file in the `src/main/resources` directory to include your MySQL username and password
* Run the application using your IDE or by running the command `mvn spring-boot:run` in the project directory
* Access the APIs using any HTTP client such as Postman or cURL.
>## Data flow
 The application is built using the SpringBoot framework and consists of four layers: controller, model, service, and repository.-

* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## API Documentation
The API endpoints will be available at http://localhost:8080.

#### Endpoints
>Stock Controller

This controller includes the following endpoints for user authentication:

* Get /stock/abovePrice/price/{price}/lowerDate/date/{date}: get all stock which is greater than given price and lower date
* POST /stck/: create a new post
* GET /stock/type/{stocktype}: get a specific stock by type of stock
>### Schemas
This project is aimed at creating the basic design of the backend of Stock. This Readme.md file will guide you through the project setup, the models used, and the API endpoints available.

## Models

@Entity
@Table
Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer stockId;
    private String stockName;
    private Double stockPrice;
    private Integer stockOwnerCount;
    private String stockType;
    private Double stockMarketCap;
    private LocalDateTime stockBirthTimestamp;
}
>## Contributors

* [Biswajeet Mohanta](https://github.com/Biswajeetmohanta123)

>## Project Summary
This project includes the basic design of the backend of Mapping, including stock model, and API endpoints for stock get and post creation/retrieval. Further improvements can be made to include additional features such as comment and like functionality
