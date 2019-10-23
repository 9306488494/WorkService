I know , After update of Oreo and newer version developers are facing alot of issue in Background services. Many methods are deprecated such startService();, onStart(); , onStartCommand() etct etc.
Most of the android developers are confuse and they thought that JobSchduler is used for limitation for background services and they though Firebase JobDispatcher, FCM and WorkManager , Alarm manager help to run the background services. but how to use them and how to make flow of them with jobschduler.

They also confuse the job Dispatch time , some are confuse and say time is 30 sec. some says 15 min. etc ..

So after all review and issues on Background services i launched my new API named....WorkService and its sub methods goScheduler(); help android developers to write less codes for background services.

You just need to implement an dependecy:

implementation 'com.github.9306488494:WorkService:1.3'

and use goScheduler(); with two parameters, first is context and second is about Activity Tag(Current Activity tag).

And copy this code and paste the service tag in Manifest :

<receiver android:name="MyBroadcastReceiver" >
        </receiver>

and you background services start after kill the application.
Minimum timeout will be 30 seconds. But after start first services its depend your next timeout that you mention as .setPeriodic() or .setMinimumLatency(); time.

Its faster than others.
Also include fast Gradle Sync and build.

*Important: check the permission in the Manifest
 <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED" />
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE" />
