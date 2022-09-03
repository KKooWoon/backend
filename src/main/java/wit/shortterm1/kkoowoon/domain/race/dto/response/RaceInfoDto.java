package wit.shortterm1.kkoowoon.domain.race.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import wit.shortterm1.kkoowoon.domain.race.persist.Race;

import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RaceInfoDto {

    @ApiModelProperty(value = "레이스 ID", required = true, example = "2")
    private Long raceId;

    @ApiModelProperty(value = "레이스 시작 일자", required = true, example = "2022-08-01")
    private LocalDate startedAt;

    @ApiModelProperty(value = "레이스 종료 일자", required = true, example = "2022-09-30")
    private LocalDate endedAt;

    @ApiModelProperty(value = "멤버 수", required = true, example = "23")
    private int memberCount;

    @ApiModelProperty(value = "레이스 이름", required = true, example = "다이어트 빡세게하는 모임")
    private String name;

    @ApiModelProperty(value = "레이스 코드", required = true, example = "AOBUDC")
    private String raceCode;

    @ApiModelProperty(value = "레이스 태그", required = true, example = "#다이어트")
    private String raceTag;

    @ApiModelProperty(value = "비밀방 여부", required = true, example = "true/false")
    private boolean privateOrNot;

    @ApiModelProperty(value = "레이스 한줄 설명", required = true, example = "다이어트 방입니다.")
    private String description;

    private RaceInfoDto(Long raceId, LocalDate startedAt, LocalDate endedAt, int memberCount,
                       String name, String raceCode, String raceTag, boolean privateOrNot, String description) {
        this.raceId = raceId;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
        this.memberCount = memberCount;
        this.name = name;
        this.raceCode = raceCode;
        this.raceTag = raceTag;
        this.privateOrNot = privateOrNot;
        this.description = description;
    }

    public static RaceInfoDto createDto(Race race) {
        return new RaceInfoDto(race.getId(), race.getStartedAt(), race.getEndedAt(), race.getMemberCount(),
                race.getName(), race.getRaceCode(), race.getRaceTag(), race.isPrivateOrNot(), race.getDescription());
    }
}
