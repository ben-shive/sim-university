public class Staff extends Employee
{
    String title;

    /**
     *
     * @param firstNameIn
     * @param lastNameIn
     * @param phoneNumberIn
     * @param emailAddressIn
     * @param officeIn
     * @param officePhoneNumberIn
     * @param employmentDateIn
     * @param titleIn
     */
    
    public Staff(String firstNameIn, String lastNameIn, String phoneNumberIn, String emailAddressIn,
            String officeIn, String officePhoneNumberIn, String employmentDateIn, String titleIn)
    {
        super(firstNameIn, lastNameIn, phoneNumberIn, emailAddressIn, officeIn, 
                officePhoneNumberIn, employmentDateIn);
        this.title = titleIn;
    }
    
    @Override
    public String toString()
    {
        return "Staff\n" + "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n"
                + "Phone Number: " + phoneNumber + "\n" + "Email Address: " + emailAddress + "\n"
                + "Office: " + office + "\n" + "Office Phone Number: " + officePhoneNumber + "\n"
                + "Employment Date: " + employmentDate + "\n" + "Rank: " + title + "\n";
    }
}
