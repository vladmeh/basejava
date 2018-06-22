import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10000];

    void clear() {
        Arrays.fill(storage, null);
    }

    void save(Resume resume) {
        for (int i = 0; i < size(); i++) {
            if (storage[i] == null) {
                storage[i] = resume;
                break;
            }
        }
    }

    Resume get(String uuid) {
        Resume resume = new Resume();
        try {
            resume = Arrays.stream(storage).filter(r -> r.uuid.equals(uuid)).findFirst().get();
        } catch (NullPointerException e) {
            System.out.println("Резюме uuid:"+ uuid + " - не найдено.");
        }
        return resume;
    }

    void delete(String uuid) {
        for (int i = 0; i < size(); i++) {
            if (storage[i].uuid.equals(uuid)){
                storage[i] = null;
                break;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.stream(storage)
                .filter(s -> (s != null))
                .toArray(Resume[]::new);
    }

    int size() {
        return storage.length;
    }
}
