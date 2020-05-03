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

![linearlayout_horizontal](https://user-images.githubusercontent.com/6762927/80862938-bd3abf80-8cb3-11ea-94b3-bcfa10d5c748.png)
![linearlayout_vertical](https://user-images.githubusercontent.com/6762927/80862948-d7749d80-8cb3-11ea-9d76-753d7740542f.png)

## 03_relativelayout
    - layout_centerInParent : 부모 컨테이너의 수평과 수직 방향의 중앙
    - layout_toRightOf : 지정한 레이아웃의 오른쪽
    - layout_above : 지정한 레이아웃의 위쪽
    - layout_below : 지정한 레이아웃의 아래쪽
    - layout_toLeftOf : 지정한 레이아웃의 왼쪽

![relativelayout1](https://user-images.githubusercontent.com/6762927/80863260-f5db9880-8cb5-11ea-9934-16ca89ca7283.png)

    - 오른쪽 위쪽 대각선 붙이기 : layout_above + layout_toRightOf
    - 왼쪽 위쪽 대각선 붙이기 : layout_above + layout_toLeftOf
    - 오른쪽 아래쪽 대각선 붙이기 : layout_below + layout_toRightOf
    - 왼쪽 아래쪽 대각선 붙이기 : layout_below + layout_toLeftOf
    - 중앙의 위쪽 붙이기 : layout_centerInParent + layout_above
    - 중앙의 아래쪽 붙이기 : layout_centerInParent + layout_below
    - 중앙의 오른쪽 붙이기 : layout_centerInParent + layout_toRightOf
    - 중앙의 왼쪽 붙이기 : layout_centerInParent + layout_toLeftOf

![relativelayout2](https://user-images.githubusercontent.com/6762927/80863261-f70cc580-8cb5-11ea-8038-5bb3cf1de6ed.png)
    
    - layout_alignParentTop : 뷰를 부모의 위쪽에 맞춤
    - layout_alignParentBottom : 뷰를 부모의 아래쪽에 맞춤
    - layout_alignParentRight : 뷰를 부모의 오른쪽에 맞춤
    - layout_alignParentLeft : 뷰를 부모의 왼쪽에 맞춤

![relativelayout3](https://user-images.githubusercontent.com/6762927/80863262-f7a55c00-8cb5-11ea-9b0b-eae32ba1a544.png)


# 04 framelayout
- 여러개의 레이아웃을 겹쳐서 사용
- 전체화면 레이아웃에 나머지 레이아웃을 위에 그림
- 겹치는 부분은 가장 위의 레이아웃에 가려짐

![framelayout1](https://user-images.githubusercontent.com/6762927/80915134-1de8fb80-8d8b-11ea-93bb-e98a3d6a7bef.png)

