# TemperatureConverter

- formula: c = (f-32) * 5/9
- This application converts temperature values from Fahrenheit to Celsius
- The application should accept decimal entries like 77.5 using getDouble()
- The application should format the Celsius temperature to allow for up to 2 decimal places

    using NumberFormat.getNumberInstance(), then setMaximumFractionDigits(2) to get 2 decimal places
    Convert double type of Celsius degree after the calculation to a string and format it with NumberFormat
    
- Assume that the user will enter valid data
- The application should continue only if the user enters y or Y to continue

    using while loop to perform calculation until user's choice isn't y or Y
    
    create Scanner instance to scan for user's input // assume Scanner object named sc is created
    
      example: //create a string object and initialize a value to it
                String choice = "y";
                while (choice.equalsIgnoreCase("y")) {
                  //logic goes here
                }
