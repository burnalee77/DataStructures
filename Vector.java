package DataStructure;

public class Vector implements List{
    private boolean isEmpty = true;
    private int count;
    private String[] games = new String[5];

    @Override
    public void add(String item) {
     isEmpty = false;
     games[count] = item;
     count++;
    }
    @Override
    public void remove(int id) {
     games[id] = null;
     count--;
    }

    @Override
    public void remove(String item) {
     for(int v = 0;v < games.length;v++){
         if(games[v] == item ){
             games[v] = null;
         }
     }
    }

    @Override
    public String get(int id) {
        return games[id];
    }

    @Override
    public void add(int id, String item) {
      for(int v = games.length - 1;v > id; v--){
          games[v] = games[v -1];
      }
      games[id] = item;
      count++;
    }

    @Override
    public void clear() {
     for(int v = 0; v < games.length; v++){
         games[v] = null;
         isEmpty = true;
     }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public boolean contains(String otherItem) {
        for (int i = 0; i < games.length; i++) {
            if (games[i] == otherItem) {
                return true;
            }
        }
        return false;
        }
    public void set(int id, String otherItem){
        games[id] = otherItem;
        count++;
    }
}
