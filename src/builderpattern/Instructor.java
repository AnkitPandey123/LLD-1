package builderpattern;

import java.util.Locale;

public class Instructor {

    private String name;
    private String email;
    private int salary;
    private int age;
    private String company;

    private Instructor(InstructorBuilder builder)
    {
        this.name = builder.name;
        this.company = builder.company;
    }

    public static InstructorBuilder getBuilder()
    {
        return new InstructorBuilder();
    }

    static class InstructorBuilder {
        private String company;
        private String name = null;

        public InstructorBuilder setCompany(String company)
        {
            this.company = company;
            return this;
        }

        public InstructorBuilder setName(String name)
        {
            this.company = name;
            return this;
        }

        public Instructor build()
        {
            validate();
            return new Instructor(this);
        }

        public void validate()
        {
            if(name == null || company == null)
            {
                throw new RuntimeException("values required");
            }
        }
    }
}
