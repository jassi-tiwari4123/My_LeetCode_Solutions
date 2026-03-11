/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> hm=new HashMap<>();
        for(int i=0;i<employees.size();i++){
            hm.put(employees.get(i).id,employees.get(i));
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(id);
        int res=0;
        while(!q.isEmpty()){
            int x=q.poll();
            Employee e=hm.get(x);
            res+=e.importance;
            for(int i=0;i<e.subordinates.size();i++){
                q.add(e.subordinates.get(i));
            }
        }
        return res;
    }
}