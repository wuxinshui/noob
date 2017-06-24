package chapter4.item16;

import java.util.Collection;
import java.util.HashSet;

/**
 * <p>InstrumentedHashSet</p>
 * 复合优于继承
 * 与方法调用不同，继承打破了程序的封装性。子类依赖于父类中特定功能的实现细节。
 * 超类的实现有可能会随着发行版本的变化而变化，子类可能会遭到破坏。
 * 子类必须要跟着超类的变化而变化，除非超类是专门为了扩展而设计，并且有很好的文档说明。
 * <p>
 * 实现继承而不是接口继承将会使子类变得脆弱：
 * 1.子类重写的方法逻辑和父类的逻辑不一致。
 * 例如：HashSet的父类addAll()是调用add()实现的，如果HashSet的子类重写addAll()、add()方法，
 * 将会导致新增元素的逻辑不一致。
 * 2.超类在后续的发行版中新增了新的方法，子类未覆盖新的方法，可能导致子类的实例发生非法的操作。
 * 3.超类新增了新的方法，仅方法的返回类型和子类中持有的方法不一样，会导致子类无法通过编译。
 * <p>
 * 复合(composition)可以避免前面提到的所有问题：不用扩展现有的类，在新的类中新增一个
 * 私有域，引用现有类的一个实例。新类中的每个实例方法都可以调用被包含的现有类实例中对应的方法，
 * 这被称为转发(forwarding),新类中的方法被称为转发方法(forwarding method)。
 * 这样的类将会非常稳固，不会依赖现有类的实现细节。
 * <p>
 * 在适合使用复合的地方使用了继承，会暴露父类的实现细节，而且客户端还有可能直接访问这些细节。
 * 这样得到的API会永远限制在原始的实现上，永远限定了类的性能。
 * <p>
 * 只有当子类真正是超类的子类型时，才适合继承。即存在is-a的关系。
 * 否则建议用复合和转发机制来代替继承，尤其是当存在适当的接口可以实现包装类(wrapper class)的时候。
 *
 * @author wuxinshui
 */
//Broken - Inappropriate use of inheritance
public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0;

    public InstrumentedHashSet() {

    }

    public InstrumentedHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
