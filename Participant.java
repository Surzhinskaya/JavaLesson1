package Homework1;


    public class Participant extends Team{
        private String gender;
        private  String nameParticipant;
        private float maxJump;
        private int maxCountJump;


        Participant (String gender, String nameParticipant, float maxJump, int maxCountJump) {
            super("Number 1");
            this.gender = gender;
            this.nameParticipant = nameParticipant;
            this.maxJump = maxJump;
            this.maxCountJump = maxCountJump;
        }

        String getGender() {
            return gender;
        }
        String getNameParticipant() {
            return nameParticipant;
        }

        float getMaxJump() {
            return maxJump;
        }

        int getMaxCountJump() {
            return maxCountJump;
        }

        protected boolean jump(float jumpheight) {
            return jumpheight <= maxJump;
        }

        protected boolean countJump (int countCourse) {
           return countCourse <= maxCountJump;
        }

        String getInfo() {
           return gender + " " +
                   nameParticipant + " , может прыгнуть на " +
                   maxJump + " м, может прыгнуть " +
                   maxCountJump + " раз";

        }


    }

