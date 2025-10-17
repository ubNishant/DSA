class InvalidDataException extends Exception {
    public InvalidDataException() {
        super();
    }

    public InvalidDataException(String message) {
        super(message);
    }
}

class Profile {
    private String name;
    private int age;
    private String gender;
    private String phoneNumber;

    public Profile(String name, int age, String gender, String phoneNumber) throws InvalidDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidDataException("Name cannot be empty");
        }
        if (age <= 0) {
            throw new InvalidDataException("Age must be greater than 0");
        }
        if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female")) {
            throw new InvalidDataException("Gender must be either 'male' or 'female'");
        }
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidDataException("Phone number must be 10 digits");
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidDataException("Name cannot be empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidDataException {
        if (age <= 0) {
            throw new InvalidDataException("Age must be greater than 0");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws InvalidDataException {
        if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female")) {
            throw new InvalidDataException("Gender must be either 'male' or 'female'");
        }
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws InvalidDataException {
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidDataException("Phone number must be 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

public class MatrimonyProgram {
    private static Profile[] profiles = new Profile[100]; // Fixed size array for simplicity
    private static int profileCount = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Matrimony Program Menu ===");
            System.out.println("1. Register Profile");
            System.out.println("2. View Profiles");
            System.out.println("3. Update Profile");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = getIntInput();

            switch (choice) {
                case 1:
                    registerProfile();
                    break;
                case 2:
                    viewProfiles();
                    break;
                case 3:
                    updateProfile();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }

    private static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }

    private static void registerProfile() {
        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = getIntInput();
            System.out.print("Enter gender (male/female): ");
            String gender = scanner.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();

            Profile profile = new Profile(name, age, gender, phoneNumber);
            profiles[profileCount++] = profile;
            System.out.println("Profile registered successfully!");

        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void viewProfiles() {
        if (profileCount == 0) {
            System.out.println("No profiles available.");
        } else {
            System.out.println("\n=== Profiles ===");
            for (int i = 0; i < profileCount; i++) {
                System.out.println(profiles[i]);
            }
        }
    }

    private static void updateProfile() {
        try {
            System.out.print("Enter the name of the profile to update: ");
            String name = scanner.nextLine();
            Profile profileToUpdate = null;

            for (int i = 0; i < profileCount; i++) {
                if (profiles[i].getName().equalsIgnoreCase(name)) {
                    profileToUpdate = profiles[i];
                    break;
                }
            }

            if (profileToUpdate == null) {
                System.out.println("Profile not found.");
                return;
            }

            System.out.print("Enter new name (leave blank to keep current): ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) {
                profileToUpdate.setName(newName);
            }

            System.out.print("Enter new age (leave blank to keep current): ");
            String newAgeStr = scanner.nextLine();
            if (!newAgeStr.isEmpty()) {
                int newAge = Integer.parseInt(newAgeStr);
                profileToUpdate.setAge(newAge);
            }

            System.out.print("Enter new gender (male/female, leave blank to keep current): ");
            String newGender = scanner.nextLine();
            if (!newGender.isEmpty()) {
                profileToUpdate.setGender(newGender);
            }

            System.out.print("Enter new phone number (leave blank to keep current): ");
            String newPhoneNumber = scanner.nextLine();
            if (!newPhoneNumber.isEmpty()) {
                profileToUpdate.setPhoneNumber(newPhoneNumber);
            }

            System.out.println("Profile updated successfully!");

        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please try again.");
        }
    }
}
