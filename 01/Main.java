public class Main {
  public static void main(String[] args) {
//        LoginForm loginForm = new LoginForm();
    DBUtils dbUtils = new DBUtils();
    UserDao userDao = new UserDao(dbUtils);
    LoginForm loginForm = new LoginForm(userDao, "username", "password");
    loginForm.validate();
  }
}
