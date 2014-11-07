Java集合框架
-----------

##比较ArrayList与LinkList
	1.ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。 
	2.对于随机访问get和set，ArrayList优于LinkedList，因为ArrayList可以随机定位，而LinkedList要移动指针一步一步的移动到节点处。（参考数组与链表来思考）
	3.对于新增和删除操作add和remove，LinedList比较占优势，只需要对指针进行修改即可，而ArrayList要移动数据来填补被删除的对象的空间。
	ArrayList和LinkedList是两个集合类，用于存储一系列的对象引用(references)。例如我们可以用ArrayList来存储一系列的String或者Integer。那么ArrayList和LinkedList在性能上有什么差别呢？什么时候应该用ArrayList什么时候又该用LinkedList呢？
	一．时间复杂度
	首先一点关键的是，ArrayList的内部实现是基于基础的对象数组的，因此，它使用get方法访问列表中的任意一个元素时(random-access)，它的速度要比LinkedList快。LinkedList中的get方法是按照顺序从列表的一端开始检查，直到另外一端。对LinkedList而言，访问列表中的某个指定元素没有更快的方法了。
	
