public class VectorSchoolAverage {
    public static void main(String[] args) {
        double[] studentsGrade={10.0,7.5,8.4,10.0,5.5,4.2,10.0,9.6,6.5,3.3,8.8,10.0,2.0,7.7,4.4};
        double gradeSum = 0, globalAverage;
        for (int i = 0; i < studentsGrade.length ; i++) {
            gradeSum += studentsGrade[i];
        }
        globalAverage = gradeSum / studentsGrade.length;
        int aboveAverage = 0;
        for (int i = 0; i < studentsGrade.length ; i++) {
        if (studentsGrade[i] > globalAverage){
            aboveAverage++;
        }
        }
        System.out.println("média das notas: " + globalAverage);
        System.out.println("Número de alunos acima da média: " + aboveAverage);

    }
}
