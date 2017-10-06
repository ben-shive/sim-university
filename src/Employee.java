public class Employee extends Person
{
    String office, officePhoneNumber, employmentDate;
    
    /**
     *
     * @param firstNameIn
     * @param lastNameIn
     * @param phoneNumberIn
     * @param emailAddressIn
     * @param officeIn
     * @param officePhoneNumberIn
     * @param employmentDateIn
     */
    
    public Employee(String firstNameIn, String lastNameIn, String phoneNumberIn, String emailAddressIn,
            String officeIn, String officePhoneNumberIn, String employmentDateIn)
    {
        super(firstNameIn, lastNameIn, phoneNumberIn, emailAddressIn);
        this.office = officeIn;
        this.officePhoneNumber = officePhoneNumberIn;
        this.employmentDate = employmentDateIn;
    }
}
