class FileLoader {
    public String load(String path) {
        System.out.println("Chargement du fichier: " + path);
        return "data-from-" + path;
    }
}

class DatabaseGateway {
    public void save(String data) {
        System.out.println("Sauvegarde dans la base: " + data);
    }
}

class DataImporter {
    private FileLoader loader = new FileLoader();
    private DatabaseGateway gateway = new DatabaseGateway();

    public void importData(String path) {
        String data = loader.load(path);
        gateway.save(data);
    }
}

class MainDIPBefore1 {
    public static void main(String[] args) {
        DataImporter importer = new DataImporter();
        importer.importData("/tmp/data.csv");
    }
}
