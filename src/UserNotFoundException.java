public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String userId, String name) {
        super("При попытке поиска клиента в таблице User по userId: " + userId
                + " и имени:" + name + ". Его не удалось найти");
    }

    public UserNotFoundException(String userId) {
        super("При попытке поиска клиента в таблице User по userId: " + userId
                + ". Его не удалось найти");
    }
}
