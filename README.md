به نام خدا

# آزمایش ششم آزمایشگاه مهندسی نرم‌افزار (Code Refactoring)
## مقدمات آزمایش
در این آزمایش قصد داریم تا چند مورد از الگو‌های بازآرایی کد را روی یک پروژه اعمال کنیم.
## شرح آزمایش
طبق دستورالعمل آزمایش موارد مختلف بازآرایی را در قسمت‌های مختلف کد اعمال می‌کنیم که در زیر به آن‌ها اشاره شده است:
### ریفکتور facade مورد اول
در کلاس Parser به سرویس‌های CodeGenerator و Lexical Analysis در چند موقعیت دسترسی شده بود که این‌ دسترسی‌ها را به یک کلاس مجزای ParserFacade منتقل کردیم که برای اعمال الگوی طراحی Facade می‌باشد.
![Screenshot 2023-12-11 200130](https://github.com/kianomoomi/SELab6/assets/59165380/bcbc3ab3-0ae3-43ce-8378-f46e81cca7d7)
برای مشاهده دقیق‌تر تغییرات چه در این مورد چه در موارد بعدی می‌تواند از تاریخچه کامیت‌ها به خود کامیت‌ها دسترسی داشته باشید و اطلاعات دقیق‌تر را در آنجا مشاهده کنید.
### ریفکتور facade مورد دوم
به منظور اعمال الگو facade برای کلاس main بک کلاس ParserStarterFacade را تعریف می‌کنیم و از داخل main این کلاس صدا زده می‌شود.
![image](https://github.com/kianomoomi/SELab6/assets/59165380/bf407573-5003-4ab3-9a7a-c17f1087229d)
![image](https://github.com/kianomoomi/SELab6/assets/59165380/996b0d56-7b1f-45c8-9a5f-fb16839a6e52)
### ریفکتور strategy
در این بخش ما switch case داخل کلاس Address را برداشته و به جای آن یک Strategy گذاشتیم. با این تغییر در صورتی که در هر کدام از آن caseها بخواهد کاری انجام شود می‌شود به راحتی تنها در کلاس‌های strategy مربوطه اضافه شود.
![image](https://github.com/kianomoomi/SELab6/assets/59165380/75c227ed-5d98-4f1d-9c5a-425ceb7fee8b)
![image](https://github.com/kianomoomi/SELab6/assets/59165380/ea345127-7a59-433a-9550-62bc85054bcf)
![image](https://github.com/kianomoomi/SELab6/assets/59165380/b4921048-67bb-4071-9d55-ae2fb672f33d)
![image](https://github.com/kianomoomi/SELab6/assets/59165380/ade0f594-df57-4197-89fc-340fcf0def98)
### ریفکتور separate query from modifier
در این بخش از آنجا که هم مقدار lastDateAddress تغییر میکرد و هم return میشد، دو عملکرد را در قالب دو متد جدا کردیم و رفرنس‌های آن را نیز تغییر دادیم.
![image](https://github.com/kianomoomi/SELab6/assets/59165380/139e863f-48ca-4411-ab7d-2e849348da4f)
![image](https://github.com/kianomoomi/SELab6/assets/59165380/ffee603f-85cd-46f7-a0e7-909a43936d59)
