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
در این بخش از آنجا که هم مقدار lastDataAddress تغییر میکرد و هم return میشد، دو عملکرد را در قالب دو متد جدا کردیم و رفرنس‌های آن را نیز تغییر دادیم.
![image](https://github.com/kianomoomi/SELab6/assets/59165380/139e863f-48ca-4411-ab7d-2e849348da4f)
![image](https://github.com/kianomoomi/SELab6/assets/59165380/ffee603f-85cd-46f7-a0e7-909a43936d59)
### ریفکتور self encapsulated field
بر اساس این refactor استفاده فیلد addressContext را محدود به getter آن می‌کنیم که package-private است و بنابراین دیگر از همه‌جای کد نمی‌توان به آن دسترسی مستقیم داشت.
![image](https://github.com/kianomoomi/SELab6/assets/59165380/4a0c59e6-4cdd-43d4-8740-73aa200e45c6)
### ریفکتور extract method
دو تکرار معنادار در کد را که مربوط به ثبت متد یک کلاس در پارسر هست رو به صورت یک متد جدا به نام registerMethod درآوردیم که ریفکتور Extract Method محسوب می‌شود.
![image](https://github.com/kianomoomi/SELab6/assets/59165380/fb4eb179-59b1-4f75-bd09-ceef578cbd2d)
### ریفکتور inline temp
یکی از local temp variableها رو که تنها تعریف و بعد استفاده شده بود( اسم آن prime است) را به صورت در خط استفاده کردیم که ریفکتور inline temp محسوب می‌شود.
![image](https://github.com/kianomoomi/SELab6/assets/59165380/0a1829a8-a9c1-40b5-a9ef-d2cff45a71e2)
## پرسش‌ها
### سوال ۱
کد تمیز یک کد است که به‌طور واضح و خواندنی نوشته شده است تا برنامه‌نویسان دیگر بتوانند به راحتی آن را درک کنند. این کد از اصول توافقی و قواعد ثابتی استفاده می‌کند تا دارای افزونگی (duplication) نباشد و سازمان‌دهی منطقی داشته باشد. اجزای مختلف کد به‌طور مناسب جدا شده‌اند، به‌طوری که فرایندها و قسمت‌های مختلف کد از هم جدا و قابل فهم باشند. علاوه بر این، کد تمیز به‌گونه‌ای طراحی شده است که در صورت نیاز به تغییرات در آینده، تغییرات مورد نیاز با حداقل تغییرات و با دشواری کمتری قابل اعمال باشند و پذیرای نگهداری (maintainable) باشد.


بدهی فنی به اشتباهات یا نقص‌هایی در کد یا ساختار نرم‌افزار اشاره دارد که ناشی از کار عجله‌ای یا نادقیقی توسعه‌دهندگان است. این نواقص ممکن است در ابتدا نادیده گرفته شده ولی در آینده ممکن است به یک مشکل بزرگ تبدیل شوند که تیم توسعه مجبور به برطرف کردن آن شود. به‌عبارت دیگر، این وضعیت ناشی از اولویت دادن به تحویل سریع کد بدون رسیدن به کد کامل و بهینه است.


بوی بد اصطلاحا به اشتباهاتی اشاره دارد که در زمان نوشتن کد و توسعه نرم‌افزار انجام می‌شود و ممکن است بعدها منجر به وقوع مشکلات بزرگتری در ساختار کد شود. این نوع اشتباهات ممکن است به دلایل مختلفی مانند طراحی ناصحیح، نوشتن کد غیرخوانا، عدم رعایت استانداردهای برنامه‌نویسی و دیگر عوامل بوجود آیند. به طور خاص، این اشتباهات معمولاً در زمان بازبینی و بازآرایی کد به سادگی قابل شناسایی و اصلاح هستند، اما ممکن است نشان‌دهنده مشکلات اساسی و ‌عمیق‌تری در ساختار کلی برنامه باشند که نیاز به رفع و بهبودات جدی‌تر دارند.

### سوال ۲
مورد اول، "bloaters"، به کدها، توابع، و کلاس‌هایی اشاره دارد که به طور نسبی حجیم و بزرگ شده‌اند و کار با آن‌ها دشوار است. این بلوترها معمولا در ابتدا فورا به وجود نمی‌آیندs، بلکه به تدریج در طول زمان و با توسعه برنامه به وجود می‌آیند.

مورد دوم، "object oriented abusers"، به نقض یا استفاده نادرست از اصول برنامه‌نویسی شی‌ءگرا اشاره دارد.

مورد سوم، "change preventers"، وضعیتی است که برای اعمال تغییرات در یک بخش از کد، نیاز به تغییر مقادیر زیادی در بخش‌های دیگر نیز هست. این وضعیت باعث پیچیدگی و هزینه‌بر شدن فرآیند نگهداری و توسعه می‌شود.

مورد چهارم، "dispensable"، به عناصری اشاره دارد که بی‌اهمیت و غیرضروری هستند و حذف آن‌ها موجب بهبود کد و افزایش کارایی و قابلیت فهم آن می‌شود.

مورد پنجم، "couplers"، به مواردی اشاره دارد که نشان‌دهنده ارتباطات زیاد و شدید بین کلاس‌ها هستند که باعث پیچیدگی بیش از حد در ساختار نرم‌افزار می‌شوند و با استفاده از delegation می‌توانند این ارتباطات را کاهش داد و تغییراتی در کد ایجاد کرد.

### سوال ۳
بوی بد Lazy Class، از دسته "Dispensable" یا اشیاء غیرضروری و بی‌معنی در زمینه‌ی توسعه نرم‌افزار است. این اشیاء کد را نه تنها بهبود نمی‌دهند، بلکه باعث پیچیدگی و کندی در فهم کد می‌شوند. این کلاس‌ها معمولاً دارای کمترین کارایی و عملکرد در سیستم هستند و در زمانی که می‌خواهیم کد را بهینه‌تر و قابل فهم‌تر کنیم، به آن‌ها نیازی نیست.

برای برطرف کردن بوی بد Lazy Class، می‌توان از دو نوع بازآرایی استفاده کرد:

1. کلاس درون خطی (Inline Class): اگر یک کلاس تنها شامل کمترین کد و عملکرد و تقریباً بدون هیچگونه منطق مربوط به کاربرد خاصی باشد، می‌توان آن را بازآرایی کرد و قسمت‌های کد مرتبط را به کلاس‌های دیگر منتقل کرد.

2. فروپاشی سلسله مراتب (Collapse Hierarchy): در صورتی که یک کلاس فرزند، تقریباً هیچ متد خاص و ارثی از پدر خود ندارد، می‌توان با استفاده از این بازآرایی، سلسله مراتب را ترکیب کرده و از کمترین سلسله مراتب استفاده کرد.

زمانی که باید این بو را نادیده بگیریم، زمانی است که احتمالاً کلاس Lazy به عنوان یک نماد یا آماده‌سازی برای توسعه‌های آینده در نظر گرفته شده است. این ممکن است به دلیل نیاز به یک ساختار آماده برای اضافه کردن منطق جدید در آینده باشد. در این حالت باید توازن بین وضوح کد و سادگی را در نظر بگیریم تا از ایجاد پیچیدگی‌های زیاد در کد جلوگیری کنیم.
