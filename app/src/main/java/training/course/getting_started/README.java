package training.course.getting_started;

/**
 * Created by wangbin on 15-10-15.
 */
//public class README {
//}

/*说明:
    执行Android程序
        在Android Studio里，点击工具栏里的Run按钮

        或者使用命令行，进入你项目的根目录直接执行

        ant debug
        adb install bin/MyFirstApp-debug.apk



        关于从命令行安装运行应用程序的详细讲解:

        打开命令行并切换当前目录到Andriod项目的根目录，在debug模式下使用Gradle编译项目，使用gradle脚本执行assembleDebug编译项目，执行后会在build/目录下生成MyFirstApp-debug.apk。

        Windows操作系统下，执行：

        gradlew.bat assembleDebug
        Mac OS或Linux系统下：

        $ chmod +x gradlew
        $ ./gradlew assembleDebug
        编译完成后在app/build/outputs/apk/目录生成apk。

        Note: chmod命令是给gradlew增加执行权限，只需要执行一次。
        确保 Android SDK里的 platform-tools/ 路径已经添加到环境变量PATH中，执行：

        adb install bin/MyFirstApp-debug.apk
        在我们的Android设备中找到 MyFirstActivity，点击打开。

 */

/*
   Android控件的各属性说明:

      android:id

        这是定义View的唯一标识符。可以在程序代码中通过该标识符对对象进行引用，例如对这个对象进行读和修改的操作(在下一课里将会用到)。

        当想从XML里引用资源对象的时候必须使用@符号。紧随@之后的是资源的类型(这里是id)，然后是资源的名字(这里使用的是edit_message)。

        +号只是当你第一次定义一个资源ID的时候需要。这里是告诉SDK此资源ID需要被创建出来。在应用程序被编译之后，
        SDK就可以直接使用ID值，edit_message是在项目gen/R.java文件中创建一个新的标识符，这个标识符就和EditText关联起来了。
        一旦资源ID被创建了，其他资源如果引用这个ID就不再需要+号了。这里是唯一一个需要+号的属性。

      权重android:layout_weight
        使用 android:layout_width="wrap_content",
        这样设置对按钮来说很合适，但是对于文本框来说就不太好了，因为用户可能输入更长的文本内容。因此如果能够占满整个屏幕宽度会更好。
        LinearLayout使用权重属性来达到这个目的，你可以使用android:layout_weight属性来设置。

        权重的值指的是每个部件所占剩余空间的大小，该值与同级部件所占空间大小有关。就类似于饮料的成分配方：
        “两份伏特加酒，一份咖啡利口酒”，即该酒中伏特加酒占三分之二。例如，我们设置一个View的权重是2，另一个View的权重是1，那么总数就是3，
        这时第一个View占据2/3的空间，第二个占据1/3的空间。如果你再加入第三个View，权重设为1，那么第一个View(权重为2的)会占据1/2的空间，
        剩余的另外两个View各占1/4。(请注意，使用权重的前提一般是给View的宽或者高的大小设置为0dp，然后系统根据上面的权重规则来计算View应该占据的空间。
        但是很多情况下，如果给View设置了match_parent的属性，那么上面计算权重时则不是通常的正比，而是反比，也就是权重值大的反而占据空间小)。

        对于所有的View默认的权重是0，如果只设置了一个View的权重大于0，则该View将占据除去别的View本身占据的空间的所有剩余空间。
        因此这里设置EditText的权重为1，使其能够占据除了按钮之外的所有空间。

        注意:
        为了提升布局的效率，在设置权重的时候，应该把EditText的宽度设为0dp。如果设置"wrap_content"作为宽度，系统需要自己去计算这个部件所占有的宽度，
        而此时的因为设置了权重，所以系统自动会占据剩余空间，EditText的宽度最终成了不起作用的属性。



 */
