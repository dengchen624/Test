/**
 * @Author wild
 * @Date 17/8/2022 下午5:15
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(12);
        user.setName("d");

    }

    static class User{
        String name;
        Integer age;
        public User(){

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
