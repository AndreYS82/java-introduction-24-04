package homework5;

public class StudentScholarship {
    public static void main(String[] args) {
        int grade1 = 3;
        int grade2 = 5;
        int grade3 = 6;
        int grade4 = 10;
        int grade5 = 12;
        double avarageScore = calculateAvarageScore(grade1, grade2, grade3, grade4, grade5);
        scholarshipDefinition(avarageScore);

    }
    public static double calculateAvarageScore(int grade1, int grade2, int grade3, int grade4, int grade5){
        return (double) (grade1 + grade2 + grade3 + grade4 + grade5)/5;
    }
    public static void scholarshipDefinition(double avarageGrade){
        if(avarageGrade >= 10){
            System.out.println("Increazed Scholarship");
            } else if(avarageGrade >= 8){
            System.out.println("Regular Scholarship");
                }else {
            System.out.println("No Scholarship");
            }
        }
        }

