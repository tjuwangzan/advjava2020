import java.util.List;

public interface SQLUtil {
    String query (User user);
    String insert(User user);
    String insert(List<User> users);
    String delete(User user);

    // 更新与其相同 ID 的数据库条目
    String update(User user);
}
