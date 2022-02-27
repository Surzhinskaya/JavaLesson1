package Homework1;

public class Team {
    public static String name;


    Team(String name) {
        this.name = name;

    }

    String getName() {
        return this.name;
    }

    String getInfo() {
        return null;
    }

    String getGender() {
        return null;
    }

    String getNameParticipant() {
        return null;
    }

    float getMaxJump() {
        return 0;
    }

    int getMaxCountJump() {
        return 0;
    }

    protected boolean jump(float jumpheight) {
        return true;
    }

    protected boolean countJump(int countCourse) {
        return true;
    }

    public void showResults(String namePersArray, String processAction2, String resultAction) {
    }
    private static void getAllParticipant(Team[] persArray){

    }


}
