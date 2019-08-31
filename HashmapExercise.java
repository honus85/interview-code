class MyHashmap<K,V>{
  
  private Entry[] table;
  //Entry node self linked list for collisions
  static class Entry<K,V>{
     private K key;
     private V value;
     private Entry next;

     public Entry(K k, V v){
        this.key = k;
        this.value = v;
     }

     public K getKey(){return this.key;}
     public void setValue(V v){this.value = v;}
     public V getValue(){return this.value;}
     public void setKey(K k){this.key = k;}
     public void setNext(Entry next) {this.next = next;}
     public Entry getNext(){return this.next;}
  }
  //constructor
  public MyHashmap(int size){
    this.table = new Entry[size];
  }
  
  private int returnHash(K key){
      return key.hashCode() % table.length;
  }

  public void put(K key, V value){
      int hash;
      hash = returnHash(key);
      if (table[hash] == null) table[hash] = new Entry(key, value);
      else{
          Entry e = table[hash];
          while (e.getNext() != null) e = e.getNext();
          Entry temp = new Entry(key, value);
          e.setNext(temp);
      }
  }

  public Entry get(K key){
    int hash;
    hash = returnHash(key);
    Entry e = table[hash];
    if (e != null){
       //traverse the entry linked list
       while (e.getNext() != null){
          if (e.key.equals(key)) return e;
          else e = e.getNext();
       }
       return e;
    } 
    else return null;
  }
}

class HashmapExercise { 
  public static void main(String[] args) {
    int n = 10;
    MyHashmap hashmap = new MyHashmap<String, String>(n);
    hashmap.put("a", "1");
    hashmap.put("b", "2");
    System.out.println( hashmap.get("a").getValue());
    System.out.println( hashmap.get("b").getValue());
  }
}