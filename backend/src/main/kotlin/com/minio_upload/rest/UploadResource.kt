package com.minio_upload.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/upload")
class UploadResource {
    @PostMapping("/get-upload-signed-link")
    fun getSignedLink(
        @RequestParam("filename") filename: String
    ): ResponseEntity<String> {
        println(filename)
        return ResponseEntity.ok().body("A")
    }
}
