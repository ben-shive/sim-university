public class Faculty extends Employee implements Changeable
{
    String rank;

    /**
     *
     * @param firstNameIn
     * @param lastNameIn
     * @param phoneNumberIn
     * @param emailAddressIn
     * @param officeIn
     * @param officePhoneNumberIn
     * @param employmentDateIn
     * @param rankIn
     */
    
    public Faculty(String firstNameIn, String lastNameIn, String phoneNumberIn, String emailAddressIn,
            String officeIn, String officePhoneNumberIn, String employmentDateIn, String rankIn)
    {
        super(firstNameIn, lastNameIn, phoneNumberIn, emailAddressIn, officeIn, 
                officePhoneNumberIn, employmentDateIn);
        this.rank = rankIn;
    }
    
    @Override
    public void changeName(String firstNameIn, String lastNameIn) 
    {
        this.firstName = firstNameIn;
        this.lastName = lastNameIn;
    }
    
    @Override
    public String toString()
    {
        return "Faculty\n" + "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n"
                + "Phone Number: " + phoneNumber + "\n" + "Email Address: " + emailAddress + "\n"
                + "Office: " + office + "\n" + "Office Phone Number: " + officePhoneNumber + "\n"
                + "Employment Date: " + employmentDate + "\n" + "Rank: " + rank + "\n";
    }
}
