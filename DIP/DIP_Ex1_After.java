interface DataLoader {
    String load(String path);
}

interface DataStorage {
    void save(String data);
}

class FileLoader implements DataLoader {
    @Override
    public String load(String path) {
        System.out.println("Chargement du fichier: " + path);
        return "data-from-" + path;
    }
}

class DatabaseGateway implements DataStorage {
    @Override
    public void save(String data) {
        System.out.println("Sauvegarde dans la base: " + data);
    }
}

class DataImporter {
    private DataLoader loader;
    private DataStorage storage;

    public DataImporter(DataLoader loader, DataStorage storage) {
        this.loader = loader;
        this.storage = storage;
    }

    public void importData(String path) {
        String data = loader.load(path);
        storage.save(data);
    }
}

class MainDIPAfter1 {
    public static void main(String[] args) {
        DataLoader loader = new FileLoader();
        DataStorage storage = new DatabaseGateway();
        DataImporter importer = new DataImporter(loader, storage);
        importer.importData("/tmp/data.csv");
    }
}
