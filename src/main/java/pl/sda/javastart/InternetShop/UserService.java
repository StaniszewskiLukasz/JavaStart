package pl.sda.javastart.InternetShop;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> registeredUsers = new ArrayList<>();

    public boolean registration(String name, String password) {
        boolean notExist = registeredUsers.stream() // true jesli żadnego pasującego nie znajdzie
                .map(User::getName) // pobieramy z tablicy imiona
                .noneMatch(name::equals); // i porównujemy z imieniem jakie przyszło nam w metodzie
        if (notExist) { // jeśli żadne nie pasuje do tego co przyszło to wykonujemy poniższą instrukcję
            User user = new User();
            user.setName(name);
            user.setPassword(password);
            user.setId(getNextId());
            registeredUsers.add(user);
        }
        return notExist; // zwraca notExist bo to jest zmienna wrzucona w boolena
    }

    private Long getNextId() {
        Long id = registeredUsers.stream()
                .map(User::getId)
                .max(Long::compareTo)//troche nie kumam, czemu compareTo z czym on tengo maksa porównuje???
                .orElse(0L);
        return ++id;
    }

    public boolean login(String name, String password){
        User user = registeredUsers.stream()
                .filter(u -> u.getName().equals(name) && u.getPassword().equals(password))
                .findAny()
                .orElse(null);
        MainShop.user = user; // robimy to po to że w MainShop w metodzie start() na początku sprawdzmy ifem czy user==null jeśli nie to idziemy do metody dla użytkownika już zalogowanego ZAJEBISTE
        return user != null; // ta metoda nie może zwrócić nulla bo inaczej całe logowanie i rejestracja o kant dupy. Patrz if w MainShop w start();
    }
}
