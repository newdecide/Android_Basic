# Android Basic

## 01_View
    - xml코드 : 안드로이드 화면을 그리는데 사용
    - View Component : 안드로이드 화면을 구성하는 요소들
        ex) TextView, ImagaView, Button
    - 부모가 될 수 있는 컴포넌트
        ex) ConstraintLayout, LinearLayout, RelativeLayout, FrameLayout, ScrollView, TableLayout
    - 자식이 될 수 있는 컴포넌트
        ex) TextView, ImageView, Buttons, VideoView, ProgressBar
    - 속성(Attribute)
        ex) layout_width, layout_height, layout_weight, background, id
    - TextView가 갖는 속성
        ex) layout_width, layout_height, textSize, text, background, layout_margin, padding
    - padding : 내용물의 여백 조정
    - layout_margin : 자식과 부모와의 여백
    - wrap_content : 글씨의 크기에 맞춰진다.
    - match_parent : 부모의 크기에 가득찬다.
    - 화면의 단위(px) : 절대 크기 나타낼때 고정된 크기
    - 화면의 단위(dp) : 디바이스 단위 동일한 크기
    
## 02_linearlayout
    - 중앙정렬
        android:gravity="center"
    - 레이아웃 방향
        수직 : android:orientation="vertical"
        수평 : android:orientation="horizontal"

## 03_relativelayout
    - layout_centerInParent : 부모 컨테이너의 수평과 수직 방향의 중앙
    - layout_toRightOf : 지정한 레이아웃의 오른쪽
    - layout_above : 지정한 레이아웃의 위쪽
    - layout_below : 지정한 레이아웃의 아래쪽
    
