package Homework1;

import static Homework1.Course.*;

public class Homework1 {
    public static void main(String[] args) {

        Team team;
        String name = "Number 1";
        System.out.println("Создана команда " + name);

        Team[] persArray = {
                new Participant("Мужчина", "Алексей", 2.0F, 10),
                new Participant("Мужчина", "Иван", 1.8F, 8),
                new Participant("Женщина", "Екатерина", 1.5F, 6),
                new Participant("Женщина", "Ольга", 1.8F, 2)
        };


        Course[] course = new Course[]{
                new Course(1.3f),
                new Course(1.7f),
                new Course(1.9f)
        };

        getAllParticipant(persArray);
        System.out.println("***************************");
        getAllCourse(course);
        System.out.println("***************************");
        doIt();
        System.out.println("***************************");
        String winParticipant = "преодолел препятствие";
        String processAction;
        String processAction1;
        String processAction2;
        String resultAction;
        String losingResult = "Препятствие не преодолено. Дистанция не преодолена.";
        String winResult = " Препятствие преодолено.";
        String namePersArray = new String();

        for (int i = 0; i < persArray.length; i++) {
            for (int x = 0; x < course.length; x++) {
                namePersArray = persArray[i].getGender() + " " + persArray[i].getNameParticipant() + " ";
                processAction1 = " может прыгнуть максимально " + persArray[i].getMaxCountJump() + " раза. ";
                processAction2 = " может прыгнуть максимально на " + persArray[i].getMaxJump() + "м. ";


                if (persArray[i].countJump(countCourse) != true && persArray[i].jump(course[x].jumpheight)!= true ) {
                    System.out.println(namePersArray + processAction1 + losingResult);
                    continue;
                } else {
                    resultAction = persArray[i].jump(course[x].jumpheight) ? winResult : losingResult;
                   showResults(namePersArray, processAction2, resultAction);
                }
            }
        }
        System.out.println("***************************");
        getWinParticipant(persArray, course, namePersArray, winParticipant);
    }

    private static void getAllParticipant(Team[] persArray) {
        System.out.println("Все участники:");
        for (int i = 0; i < persArray.length; ++i) {
            System.out.println(i + 1 + " . " + persArray[i].getInfo());
        }
    }


    private static void getAllCourse(Course[] course) {
        System.out.println("Полоса препятствий:");
        for (int x = 0; x < course.length; ++x) {
            System.out.println(x + 1 + " . " + course[x].getInfoCourse());
        }
        System.out.println("Всего препятствий: " + countCourse);
    }



    private static void showResults(String namePersArray, String processAction, String resultAction) {
        System.out.println(namePersArray + processAction + resultAction);
    }


    private static void getWinParticipant(Team[] persArray, Course[] course, String namePersArray, String winParticipant) {
        System.out.println("Участники, преодолевшие препятствия:");
        for (int i = 0; i < persArray.length; i++) {
            for (int x = 0; x < course.length; x++) {
                namePersArray = persArray[i].getGender() + " " + persArray[i].getNameParticipant() + " ";
                if (persArray[i].countJump(countCourse) != true) {
                    continue;
                } else {
                    if (persArray[i].jump(course[x].jumpheight) == true) {
                        System.out.println(namePersArray + winParticipant + " " + course[x].jumpheight + " м ");
                    }
                }
            }
        }
    }
        public static void doIt(){
        System.out.println("Участники команды " + Team.name + ", на старт, внимание, марш!");
        }
    }

