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