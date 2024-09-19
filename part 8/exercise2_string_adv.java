package part8;

import java.util.Arrays;

public class exercise2_string_adv {
    public static void main(String[] args) {
            String inputCategory = "D1|Lập trình web$D2|Lập trình phần mềm$D3|Lập trình di động";
            String inputCourse = "1|HTML CSS|D1=2|PHP|D1=3|Laravel|D1=4|Winform|D2=5|NodeJS|D2=6|React Native|D3";
            String[] arrCategory = inputCategory.split("\\$");
            String[] arrNameCategory = new String[arrCategory.length];
            String[] arrIdCategory = new String[arrCategory.length];

            for (int i = 0; i < arrCategory.length; i++) {
                String[] parts = arrCategory[i].split("\\|");
                arrIdCategory[i] = parts[0];
                arrNameCategory[i] = parts[1];
            }

            String[] arrCourse = inputCourse.split("[|=]");
            String[] arrNameCourse = new String[arrCourse.length/2];
            int[] countCourse = new int[arrCourse.length/2];

            for (int i = 2; i < arrCourse.length; i += 3) {
                String courseId = arrCourse[i];
                String courseName = arrCourse[i-1];
                for (int j = 0; j < arrIdCategory.length; j++) {
                    if (arrIdCategory[j].equals(courseId)) {
                        if (arrNameCourse[j] == null) {
                            arrNameCourse[j] = courseName;
                        } else {
                            arrNameCourse[j] += ", " + courseName;
                        }
                        countCourse[j]++;
                        break;
                    }
                }
            }

            for (int i = 0; i < arrIdCategory.length; i++) {
                System.out.printf("%s (%d): %s%n", arrNameCategory[i], countCourse[i], arrNameCourse[i]);
            }
        }
    }
