    |
    Constraint | 詳細信息 | | -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- | -- -- -- -- -- -- -- -- -- -- -- -- -- -- | |
    @Null | 被註釋的元素必須為 null | |
    @NotNull | 被註釋的元素必須不為 null | |
    @AssertTrue | 被註釋的元素必須為 true | |
    @AssertFalse | 被註釋的元素必須為 false | |
    @Min(value) | 被註釋的元素必須是一個數字， 其值必須大於等於指定的最小值 | |
    @Max(value) | 被註釋的元素必須是一個數字， 其值必須小於等於指定的最大值 | |
    @DecimalMin(value) | 被註釋的元素必須是一個數字， 其值必須大於等於指定的最小值 | |
    @DecimalMax(value) | 被註釋的元素必須是一個數字， 其值必須小於等於指定的最大值 | |
    @Size(max, min) | 被註釋的元素的大小必須在指定的範圍內 | |
    @Digits(integer, fraction) | 被註釋的元素必須是一個數字， 其值必須在可接受的範圍內 | |
    @Past | 被註釋的元素必須是一個過去的日期 | |
    @Future | 被註釋的元素必須是一個將來的日期 | |
    @Pattern(value) | 被註釋的元素必須符合指定的正則表達式 |

    hibernate - validater 擴展的約束如下：

    |
    Constraint | 詳細信息 | | -- -- -- -- -- | -- -- -- -- -- -- -- -- -- - | |
    @Email | 被註釋的元素必須是電子郵箱地址 | |
    @Length | 被註釋的字符串的大小必須在指定的範圍內 | |
    @NotEmpty | 被註釋的字符串的必須非空 | |
    @Range | 被註釋的元素必須在合適的範圍內 |
    @NotEmpty 用在集合類上面

@NotBlank 用在String上面

@NotNull 用在基本類型上