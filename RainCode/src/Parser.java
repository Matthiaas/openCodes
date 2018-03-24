import java.util.List;

public interface Parser {

    public default List<List<Point>> parseString(String code){
        throw  new RuntimeException("Not Implemented yet");
    }

    public default List<List<Point>> parseFile(String filname){
        throw  new RuntimeException("Not Implemented yet");
    }

}
