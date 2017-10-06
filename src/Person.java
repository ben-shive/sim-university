public class Person 
{
    String firstName, lastName, phoneNumber, emailAddress;
    
    /**
     *
     * @param firstNameIn
     * @param lastNameIn
     * @param phoneNumberIn
     * @param emailAddressIn
     */
    
    public Person(String firstNameIn, String lastNameIn, String phoneNumberIn, String emailAddressIn)
    {
        this.firstName = firstNameIn;
        this.lastName = lastNameIn;
        this.phoneNumber = phoneNumberIn;
        this.emailAddress = emailAddressIn;
    }
}
