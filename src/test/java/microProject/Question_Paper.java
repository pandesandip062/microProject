package microProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Question_Paper extends Student_LoginPage {
    static Connection con;
    static PreparedStatement pt;
    static Question_Paper q;

    public static void question_1() throws SQLException, ClassNotFoundException {

        System.out.println("In which of the following is toString() method defined?");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java.lang.string");
        map.put(2, "Java.lang.object");
        map.put(3, "Java.lang.util");
        map.put(4, "None");
        System.out.println(map);
        System.out.println("choose you option");

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int ans = sc.nextInt();
            if (ans >= 1 && ans <= 4) {
                String re = map.get(ans);
                con = DB_Connection.DBCONNECTION();
                String query = "select Ans from questions where Question='In which of the following is toString() method defined?'";
                pt = con.prepareStatement(query);
                ResultSet set = pt.executeQuery();
                String ans1 = null;
                while (set.next()) {
                    ans1 = set.getString(1);

                }
                if (ans1.equals(re)) {
                    q = new Question_Paper();
                    q.marks();
                    //System.out.println("record updated succesfully");
                }

            } else {
                System.out.println("Entered wrong option, please select option in between 1-4");
                main(null);
            }
        } else {
            System.out.println("Entered wrong format input, please check your input");
            main(null);
        }
    }


    public static void question_2() throws SQLException, ClassNotFoundException {
        System.out.println("Which of the following option leads to the portability and security of Java?");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Bytecode is executed by JVM");
        map.put(2, "The applet makes the Java code secure and portable");
        map.put(3, "Use of exception handling");
        map.put(4, "Dynamic binding between objects");
        System.out.println(map);
        System.out.println("choose you option");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int ans = sc.nextInt();
            if (ans >= 1 && ans <= 4) {
                String re = map.get(ans);
                con = DB_Connection.DBCONNECTION();
                String query = "select Ans from questions where Question='Which of the following option leads to the portability and security of Java?'";
                pt = con.prepareStatement(query);
                ResultSet set = pt.executeQuery();
                String ans1 = null;
                while (set.next()) {
                    ans1 = set.getString(1);

                }
                if (ans1.equals(re)) {
                    q = new Question_Paper();
                    q.marks();
                    System.out.println("record updated succesfully");
                }

            } else {
                System.out.println("Entered wrong option, please select option in between 1-4");
                main(null);
            }
        } else {
            System.out.println("Entered wrong format input, please check your input");
            main(null);
        }
    }

    public static void question_3() throws SQLException, ClassNotFoundException {
        System.out.println("Which of the following is not a Java features?");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Dynamic");
        map.put(2, "Architecture Neutral");
        map.put(3, "Use of pointers");
        map.put(4, "Object-oriented");
        System.out.println(map);
        System.out.println("choose you option");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int ans = sc.nextInt();
            if (ans >= 1 && ans <= 4) {
                String re = map.get(ans);
                con = DB_Connection.DBCONNECTION();
                String query = "select Ans from questions where Question='Which of the following is not a Java features?'";
                pt = con.prepareStatement(query);
                ResultSet set = pt.executeQuery();
                String ans1 = null;
                while (set.next()) {
                    ans1 = set.getString(1);

                }
                if (ans1.equals(re)) {
                    q = new Question_Paper();
                    q.marks();
                    //System.out.println("record updated succesfully");
                }

            } else {
                System.out.println("Entered wrong option, please select option in between 1-4");
                main(null);
            }
        } else {
            System.out.println("Entered wrong format input, please check your input");
            main(null);
        }
    }

    public static void question_4() throws SQLException, ClassNotFoundException {
        System.out.println("In which process, a local variable has the same name as one of the instance variables?");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Serialization");
        map.put(2, "Variable Shadowing");
        map.put(3, "Abstraction");
        map.put(4, "Multi-threading");
        System.out.println(map);
        System.out.println("choose you option");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int ans = sc.nextInt();
            if (ans >= 1 && ans <= 4) {
                String re = map.get(ans);
                con = DB_Connection.DBCONNECTION();
                String query = "select Ans from questions where Question='In which process, a local variable has the same name as one of the instance variables?'";
                pt = con.prepareStatement(query);
                ResultSet set = pt.executeQuery();
                String ans1 = null;
                while (set.next()) {
                    ans1 = set.getString(1);

                }
                if (ans1.equals(re)) {
                    q = new Question_Paper();
                    q.marks();
                    //System.out.println("record updated succesfully");
                }

            } else {
                System.out.println("Entered wrong option, please select option in between 1-4");
                main(null);
            }
        } else {
            System.out.println("Entered wrong format input, please check your input");
            main(null);
        }
    }

    public static void question_5() throws SQLException, ClassNotFoundException {
        System.out.println("Which of the following is true about the anonymous inner class?");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "It has only methods");
        map.put(2, "Objects can't be created");
        map.put(3, "It has a fixed class name");
        map.put(4, "It has no class name");
        System.out.println(map);
        System.out.println("choose you option");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int ans = sc.nextInt();
            if (ans >= 1 && ans <= 4) {
                String re = map.get(ans);
                con = DB_Connection.DBCONNECTION();
                String query = "select Ans from questions where Question='Which of the following is true about the anonymous inner class?'";
                pt = con.prepareStatement(query);
                ResultSet set = pt.executeQuery();
                String ans1 = null;
                while (set.next()) {
                    ans1 = set.getString(1);

                }
                if (ans1.equals(re)) {
                    q = new Question_Paper();
                    q.marks();
                    //System.out.println("record updated succesfully");
                }

            } else {
                System.out.println("Entered wrong option, please select option in between 1-4");
                main(null);
            }
        } else {
            System.out.println("Entered wrong format input, please check your input");
            main(null);
        }
    }

    public static void question_6() throws SQLException, ClassNotFoundException {
        System.out.println("Which statement is true about Java?");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java is a sequence-dependent programming language");
        map.put(2, "Java is a code dependent programming language");
        map.put(3, "Java is a platform-dependent programming language");
        map.put(4, " Java is a platform-independent programming language");
        System.out.println(map);
        System.out.println("choose you option");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int ans = sc.nextInt();
            if (ans >= 1 && ans <= 4) {
                String re = map.get(ans);
                con = DB_Connection.DBCONNECTION();
                String query = "select Ans from questions where Question='Which statement is true about Java?'";
                pt = con.prepareStatement(query);
                ResultSet set = pt.executeQuery();
                String ans1 = null;
                while (set.next()) {
                    ans1 = set.getString(1);

                }
                if (ans1.equals(re)) {
                    q = new Question_Paper();
                    q.marks();
                    //System.out.println("record updated succesfully");
                }

            } else {
                System.out.println("Entered wrong option, please select option in between 1-4");
                main(null);
            }
        } else {
            System.out.println("Entered wrong format input, please check your input");
            main(null);
        }
    }

    public static void question_7() throws SQLException, ClassNotFoundException {
        System.out.println("Which component is used to compile, debug and execute the java programs?");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "JRE");
        map.put(2, "JIT");
        map.put(3, "JDK");
        map.put(4, "JVM");
        System.out.println(map);
        System.out.println("choose you option");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int ans = sc.nextInt();
            if (ans >= 1 && ans <= 4) {
                String re = map.get(ans);
                con = DB_Connection.DBCONNECTION();
                String query = "select Ans from questions where Question='Which component is used to compile, debug and execute the java programs?'";
                pt = con.prepareStatement(query);
                ResultSet set = pt.executeQuery();
                String ans1 = null;
                while (set.next()) {
                    ans1 = set.getString(1);

                }
                if (ans1.equals(re)) {
                    q = new Question_Paper();
                    q.marks();
                    //System.out.println("record updated succesfully");
                }

            } else {
                System.out.println("Entered wrong option, please select option in between 1-4");
                main(null);
            }
        } else {
            System.out.println("Entered wrong format input, please check your input");
            main(null);
        }
    }

    public static void question_8() throws SQLException, ClassNotFoundException {
        System.out.println("Which of these cannot be used for a variable name in Java?");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "identifier & keyword");
        map.put(2, "identifier");
        map.put(3, "keyword");
        map.put(4, "none of the mentioned");
        System.out.println(map);
        System.out.println("choose you option");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int ans = sc.nextInt();
            if (ans >= 1 && ans <= 4) {
                String re = map.get(ans);
                con = DB_Connection.DBCONNECTION();
                String query = "select Ans from questions where Question='Which of these cannot be used for a variable name in Java?'";
                pt = con.prepareStatement(query);
                ResultSet set = pt.executeQuery();
                String ans1 = null;
                while (set.next()) {
                    ans1 = set.getString(1);

                }
                if (ans1.equals(re)) {
                    q = new Question_Paper();
                    q.marks();
                    //System.out.println("record updated succesfully");
                }

            } else {
                System.out.println("Entered wrong option, please select option in between 1-4");
                main(null);
            }
        } else {
            System.out.println("Entered wrong format input, please check your input");
            main(null);
        }
    }

    public static void question_9() throws SQLException, ClassNotFoundException {
        System.out.println("What is the extension of java code files?");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, ".js");
        map.put(2, ".txt");
        map.put(3, ".class");
        map.put(4, ".java");
        System.out.println(map);
        System.out.println("choose you option");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int ans = sc.nextInt();
            if (ans >= 1 && ans <= 4) {
                String re = map.get(ans);
                con = DB_Connection.DBCONNECTION();
                String query = "select Ans from questions where Question='What is the extension of java code files?'";
                pt = con.prepareStatement(query);
                ResultSet set = pt.executeQuery();
                String ans1 = null;
                while (set.next()) {
                    ans1 = set.getString(1);

                }
                if (ans1.equals(re)) {
                    q = new Question_Paper();
                    q.marks();
                    //System.out.println("record updated succesfully");
                }

            } else {
                System.out.println("Entered wrong option, please select option in between 1-4");
                main(null);
            }
        } else {
            System.out.println("Entered wrong format input, please check your input");
            main(null);
        }
    }

    public static void question_10() throws SQLException, ClassNotFoundException {
        System.out.println("Which environment variable is used to set the java path?");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "MAVEN_Path");
        map.put(2, "JavaPATH");
        map.put(3, "JAVA");
        map.put(4, "JAVA_HOME");
        System.out.println(map);
        System.out.println("choose you option");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int ans = sc.nextInt();
            if (ans >= 1 && ans <= 4) {
                String re = map.get(ans);
                con = DB_Connection.DBCONNECTION();
                String query = "select Ans from questions where Question='Which environment variable is used to set the java path?'";
                pt = con.prepareStatement(query);
                ResultSet set = pt.executeQuery();
                String ans1 = null;
                while (set.next()) {
                    ans1 = set.getString(1);

                }
                if (ans1.equals(re)) {
                    q = new Question_Paper();
                    q.marks();
                    //System.out.println("record updated succesfully");
                }

            } else {
                System.out.println("Entered wrong option, please select option in between 1-4");
                main(null);
            }
        } else {
            System.out.println("Entered wrong format input, please check your input");
            main(null);
        }
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        question_5();
    }
}

