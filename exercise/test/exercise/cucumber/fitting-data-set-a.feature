Feature: data fitting set 1

Scenario: aardvark
Given data points from source A
  |x|y|
  |720.6384833834209|483.3344605347647|
  |1034.7253814935455|586.4532207251679|
  |945.3454929171738|607.9687566842554|
  |286.55303990845607|246.72265041244304|
  |148.40830551296378|206.864939047084|
  |400.3435986007111|315.78445214317406|
  |699.9505025514071|453.6799260913202|
  |400.93697593780786|317.63696847059595|
  |601.6968519115845|445.1037114546795|
  |24.356169259984494|127.20086993444731|
  |178.1094932274883|190.92858933823285|
  |399.0308248137533|319.10861650156727|
  |445.0577807997608|319.2084887249203|
  |581.3596658309951|379.936698791037|
  |59.80787619971643|173.99315645471262|
  |308.9150366309743|276.01051563763855|
  |459.56570650495746|354.4640986774413|
  |428.4862137044399|315.1718334200676|
  |657.6201813488653|436.96839483521086|
  |590.1313240286966|384.69541963691205|
  |705.9127437197486|410.5351962311997|
  |257.6767338858584|209.0313334820673|
  |793.4491039450385|489.90273527031565|
  |-1.8912365473517614|92.86604200541683|
  |202.43266019439793|171.15502950999604|
  |527.5594247964101|353.27914289493367|
  |172.9720529955855|196.02227775279172|
  |574.6610626214901|413.3161642031785|
  |96.36699632310916|147.6848808537724|
  |87.53522391465741|143.796821467817|
  |724.8925630197253|377.7949195119562|
  |324.3028698960201|255.84895248021292|
  |267.6512250887107|258.8444513489921|
  |373.4203303611012|305.6454566294626|
  |735.132813334945|461.15203863706984|
  |67.32289917224209|75.71146260562882|
  |376.66376435055014|231.12045357309796|
  |908.9543522836772|629.4006448217845|
  |199.21916195973117|184.8557408145294|
  |364.32402455356817|265.290415442263|
  |499.58474374509433|424.256299170187|
  |669.5959989428176|408.35930684757614|
  |721.4477146022723|443.78254697077193|
  |111.63445616615806|147.89998852079316|
  |346.2591082471083|234.18525712179576|
  |197.13049154286995|183.23964113054515|
  |162.75974669253065|156.91159402292595|
  |717.3411044704392|460.1856896167565|
  |687.6207996074394|534.8053361590253|
  |716.9552435561811|502.16906524857217|
  |663.237420766271|495.4262992475601|
  |138.29880173952807|167.02811725955647|
  |452.91718815168065|274.54822999756334|
  |298.9428824450919|189.7299494966753|
  |967.024213331289|590.9978160831496|
  |608.1363295042039|404.6535908333167|
  |554.7080790108454|370.42162078385365|
  |777.6168746391699|501.3826043664907|
  |167.2988830808181|181.58996872736853|
  |617.3533842503906|478.06953179979126|
  |66.37324694508524|140.11537133929835|
  |301.2103805053107|254.86271944653038|
  |851.2587455444404|589.6340710661246|
  |21.636634637819398|96.71957922533312|
  |94.03564576514452|140.88678505463167|
  |697.918031420433|512.1259408241633|
  |124.90143232033017|223.81119651775006|
  |124.07508353427079|154.36773240846574|
  |820.039817565587|508.46237088679294|
  |560.8681324207836|304.33306735020506|
  |580.7901299808788|384.87537269818273|
  |200.130016539769|221.15682212101478|
  |704.3384476987686|461.2569411098127|
  |817.3077642476766|510.1653051920501|
  |358.73505111470007|313.3747730253538|
  |306.56275642388846|232.8032363740083|
  |108.79755912961325|117.70298456686578|
  |967.8021674972158|586.3314851831867|
  |327.05845293482986|279.9575096043797|
  |774.6578578753865|515.5721720990621|
  |952.2964122475436|577.365236682688|
  |971.3451729592408|554.5546617029171|
  |192.50550006916936|180.24591172497634|
  |724.7141858714406|433.8741352334206|
  |459.0633023177745|278.5038805222338|
  |55.518063640270206|127.90129645274232|
  |346.47486412276857|256.08694180474396|
  |320.14292401484755|222.6980622795829|
  |527.8609356216575|395.6766787977539|
  |39.99693679279142|164.98354256584562|
  |826.8493313908525|411.686406096646|
  |67.24334137623158|142.9541932031843|
  |883.5389353275111|589.8608235868272|
  |76.58350775472046|141.703681269261|
  |882.210150254176|561.8421569914387|
  |141.97288141793075|155.3042744425512|
  |391.0138538003263|311.4076280945671|
  |570.7565350744009|367.767147558093|
  |371.80213421547603|291.3451150179907|
  |867.0527126835187|542.6969672548657|
  |529.740404599439|385.19610613103134|
  |901.858916922336|541.8865259999392|
  |885.655583064595|561.1225762599457|
  |82.16128517602208|136.88296596250245|
  |316.0772473235331|232.5187179540963|
  |839.1862440298332|473.3187621213378|
  |611.6045359267694|410.8620764210583|
  |537.3228633096735|361.13143963135184|
  |884.4655174080111|592.0323399617588|
  |397.8023459194793|310.20189719494823|
  |665.9262673171468|417.98543877973896|
  |687.1438041771594|456.14579978040734|
  |993.0035479021144|548.4873532292114|
  |528.3497084107737|408.5353869902185|
  |737.3353008542657|472.11975658935586|
  |791.1036546588334|501.8398749213858|
  |715.3743335123214|436.12291874449244|
  |459.42750519407474|231.35856009275665|
  |260.2247738889824|235.40549633716097|
  |511.73163913497876|341.75311092801337|
  |667.8058773186748|443.50956223194225|
  |878.9556007550999|522.8452837404885|
  |542.0694494015761|398.87597940499734|
  |280.8103406188198|232.36288824315636|
  |236.3783992094788|218.86122191842026|
  |829.2184159686377|468.7283004339416|
  |93.23952352570618|151.51534132342016|
  |307.2644645722669|273.28672248046576|
  |868.0489589491419|532.3235158306424|
  |294.192205532391|150.9600003881471|
  |183.0279031881549|187.33181887448407|
  |536.8866054646178|314.57646066339254|
  |444.73344791387655|333.11230680069747|
  |117.07978862553156|185.0187625443355|
  |89.53991076410283|12.332906048110843|
  |188.07146486543255|199.47129630338856|
  |578.0415144785853|389.9000405066927|
  |429.90420148749445|326.7290306230828|
  |842.673164295473|520.7321822995294|
  |182.98154095064547|194.32251649616862|
  |745.4449927412467|415.9995678917477|
  |194.03629678581103|224.38365347196168|
  |76.30595395825819|167.86666976838399|
  |395.79707189884135|352.04660954341267|
  |444.772971005965|423.31678044954623|
  |45.07659317582174|77.44669691643676|
  |97.79142510920141|96.8961354205929|
  |819.9524446713101|501.2006099113954|
  |789.5996272787983|453.71410613576825|
  |473.5783626610343|335.740137332244|
  |745.7219350870633|452.3229647893184|
  |657.3145186498925|437.49381782245354|
  |973.9563119708996|556.6646189452109|
  |81.92688051540154|149.4690657957077|
  |530.3227938363959|320.952783192057|
  |847.2821573761926|498.0435656343717|
  |926.4731527053922|563.2968811494205|
  |519.2628337409901|394.606371519968|
  |306.9633883796796|262.5909452955839|
  |295.82166758876554|272.9257045875124|
  |-18.489390689117883|129.25119445339746|
  |375.8568424726779|325.5247730865582|
  |223.61326017296278|285.67016930880993|
  |745.2685258582042|417.34394194573633|
  |945.4838488549317|584.3059584437814|
  |422.1573867523797|288.22164822158646|
  |593.9323472186686|427.5251703147164|
  |37.324013112466396|169.92191038316741|
  |166.25680609154247|195.1004478166282|
  |12.849411826172155|150.98353952207836|
  |91.60667879371087|139.62743145529973|
  |630.9466681375432|484.1333259469635|
  |856.8119708868168|494.26144564488646|
  |639.5347416085225|396.9078113014773|
  |275.65784382241816|234.20482624785927|
  |860.0347762732454|563.7367948028034|
  |791.4266842506845|496.0667082149617|
  |709.0272676449882|472.74974332748184|
  |959.3297778091863|579.8754976747476|
  |944.0120351004472|621.4100606860017|
  |209.21750743101776|153.2443965605446|
  |169.49509133088338|69.78240008919465|
  |94.01448990179482|150.8484261273972|
  |672.500120854917|425.9551306609659|
  |850.4782541193504|516.8578566442751|
  |149.13375463344354|201.16505162351365|
  |132.33661011775146|191.35304313880843|
  |679.9203693211341|474.8891200320583|
  |-14.330440351533978|120.49695196215603|
  |572.2418592209839|400.28362906261196|
  |409.8527517884686|314.921624967445|
  |914.293085489443|547.5218117950278|
  |170.34331891184755|205.25696573230078|
  |660.0797150640126|409.2802279238326|
  |903.7962208054977|584.5228611388078|
  |972.7299226394674|538.5992115194408|
  |617.0130276344913|360.34795790405246|
  |204.13083901812973|287.77451254762576|
  |753.7339473854523|446.86351326301843|
  |211.8103730857963|187.854286660326|

Then best fit is 4.561435597548888 + 1.318303938026623*x
