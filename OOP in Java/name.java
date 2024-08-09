public class name {
    private String Uni_name="daffodil"; // private = restricted access

    // Getter
    public String getUniversity() {
        return Uni_name;
    }

    // Setter
    public void setUniversity(String newName) {
        this.Uni_name = newName;
    }
}

//if we dont use get or set we cant able to access private class;
//*related to name2*