/**
 * 
 */
package com.example.demoservice.dto.base;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorDetailsDto {
	private Date timestamp;
	private long status;
	private String message;
	private String details;
	
	/* custom error code */
	private String errorCode;
}
