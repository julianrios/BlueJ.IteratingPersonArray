

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // assume there is a `counter`
        int counter = 0;
        // while `counter` is less than length of array
            // begin loop
        while(counter <= personArray.length-1) {
            // use `counter` to identify the `current Person` in the array
             // get `string Representation` of `currentPerson`
            // holds name of person and reinitializes on the next iteration with a new name
            String person = personArray[counter].toString();
            // append `stringRepresentation` to `result` variable
            result += person;
            counter++;
        }
            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
        for (int i =0; i <= personArray.length-1; i++) {
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            String person = personArray[i].toString();
            result += person;
        }
            // end loop
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        // use the above discoveries to declare for-each-loop signature
            // begin loop
        for (Person name : personArray) {
            // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            
            // object person is being returned so must be converted to a string
            String person = name.toString();
            System.out.println(name);
            result += name;
            System.out.println(result);

        }
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
