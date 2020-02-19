# weather-api testing

This project utilises the OpenWeather API and maps the returned JSON data into objects. The purpose of this project was to manually test the API to ensure the data was accurate and mapped to the appropriate POJO's.

## OpenWeather API
Please note that OpenWeather has several different API's. This program ONLY uses the [Current Weather Data](https://openweathermap.org/current) API and requests data by **City Name**. For this program to run and connect to the OpenWeather API, you will need to [sign up](https://home.openweathermap.org/users/sign_up) and request an API key.

## Built With
* [OpenWeather](https://openweathermap.org/ "OpenWeather Homepage") - The API used
* [Maven](https://maven.apache.org "Apache Maven Project") - Dependency Management
* [Jackson](https://github.com/FasterXML/jackson "Jackson Github") - JSON Parser to POJO
* [JUnit 5](https://junit.org/junit5/ "JUnit Homepage") - Used for manual testing of the API
