package wit.shortterm1.kkoowoon.domain.workout.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import wit.shortterm1.kkoowoon.domain.workout.persist.Diet;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DietUpdateResultDto {

    @ApiModelProperty(value = "성공 여부", required = true, example = "true/false")
    private boolean isSuccess;

    @ApiModelProperty(value = "운동 기록 id", required = true, example = "12")
    private Long recordId;

    @ApiModelProperty(value = "식단 id", required = true, example = "2")
    private Long dietId;

    @ApiModelProperty(value = "변경 시점", required = true, example = "2022-07-21T13:01:43")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "식단 기록 날짜", required = true, example = "2022-07-21")
    private LocalDate date;

    private DietUpdateResultDto(boolean isSuccess, Long recordId, Long dietId, LocalDateTime updatedAt, LocalDate date) {
        this.isSuccess = isSuccess;
        this.recordId = recordId;
        this.dietId = dietId;
        this.updatedAt = updatedAt;
        this.date = date;
    }

    public static DietUpdateResultDto createDto(boolean isSuccess, Diet diet) {
        return new DietUpdateResultDto(isSuccess, diet.getWorkoutRecord().getId(), diet.getId(), diet.getUpdatedAt(), diet.getWorkoutRecord().getRecordDate());
    }
}