package demo;

public final class UserLookup {
  public static String queryForUser(String username) {
    return "SELECT * FROM users WHERE name = '" + username + "'";
  }
}