
public class Student extends Person implements Changeable
{
    String classStatus;

    /**
     *
     * @param firstNameIn
     * @param lastNameIn
     * @param phoneNumberIn
     * @param emailAddressIn
     * @param classStatusIn
     */
    
    public Student(String firstNameIn, String lastNameIn, 
            String phoneNumberIn, String emailAddressIn, String classStatusIn) 
    {
        super(firstNameIn, lastNameIn, phoneNumberIn, emailAddressIn);
        this.classStatus = classStatusIn;
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
        return "Student\n" + "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n"
               + "Phone Number: " + phoneNumber + "\n" + "Email Address: " + emailAddress + "\n"
               + "Class Status: " + classStatus + "\n";
    }
}
