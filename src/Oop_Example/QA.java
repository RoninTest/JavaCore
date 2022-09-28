package Oop_Example;

class ItTeam{


    public boolean read_analyzeDocument=true;
    public boolean read_technicalAnalyzeDocument=true;

    protected boolean testResult(boolean isTestoK){
        System.out.println("Started to the Tests");
        if (isTestoK){
            System.out.println("Tests Succesfull");
        }else{
             System.out.println("Tests Fail");
        }
            return isTestoK;

    }

    protected void test(){
        System.out.println("Started to the Tests");
    }

    protected void writingAtechnicalAnalyze(){
        System.out.println("Wrote a technical analyze document");
    }

    protected void writingAanalyzeDocument(){
        System.out.println("Wrote a analyze document");

    }
    protected void development(){

    }

    protected void read(){

    }

}

class Tester extends ItTeam{

}

class Developer extends ItTeam{


}

class Analyst extends ItTeam{


}

public class QA {
    public static void main(String[] args) {
        Analyst xAnalyst = new Analyst();
        xAnalyst.writingAanalyzeDocument();

        Developer xDeveloper = new Developer();
        System.out.println("-X Development ; Did you read documents ? :  " + xDeveloper.read_analyzeDocument);
        xDeveloper.writingAtechnicalAnalyze();

        Tester xTester = new Tester();
        xTester.test();
        System.out.println("-X Tester ; Did you read documents? "
                +" "+ xTester.read_analyzeDocument
                +" "+xTester.read_technicalAnalyzeDocument);

        xTester.testResult(true);

    }
}
