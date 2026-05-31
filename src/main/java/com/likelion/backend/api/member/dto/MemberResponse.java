package com.likelion.backend.api.member.dto;

import com.likelion.backend.api.member.entity.Member;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberResponse {
    private String email;
    private String name;
    private String nickname;

    public static MemberResponse from(Member member) {
        return MemberResponse.builder()
                .email(member.getEmail())
                .name(member.getName())
                .nickname(member.getNickname())
                .build();
    }
}