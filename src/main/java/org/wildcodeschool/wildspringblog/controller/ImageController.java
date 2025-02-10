package org.wildcodeschool.wildspringblog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wildcodeschool.wildspringblog.dto.ImageDTO;
import org.wildcodeschool.wildspringblog.model.Image;
import org.wildcodeschool.wildspringblog.service.ArticleService;
import org.wildcodeschool.wildspringblog.service.ImageService;

import java.util.List;

@RestController
@RequestMapping("/images")
public class ImageController {

    private final ImageService imageService;
    private final ArticleService articleService;

    public ImageController(ImageService imageService, ArticleService articleService) {
        this.imageService = imageService;
        this.articleService = articleService;
    }

    @GetMapping
    public ResponseEntity<List<ImageDTO>> getAllImages() {
        List<ImageDTO> images = imageService.getAllImages();
        if (images.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(images);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ImageDTO> getImageById(@PathVariable Long id) {
        ImageDTO image = imageService.getImageById(id);
        if (image == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(image);
    }

    @PostMapping
    public ResponseEntity<ImageDTO> createImage(@RequestBody Image image) {
        ImageDTO savedImage = imageService.createImage(image);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedImage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ImageDTO> updateImage(@PathVariable Long id, @RequestBody Image imageDetails) {
        ImageDTO image = imageService.updateImage(id, imageDetails);
        if (image == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(image);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteImage(@PathVariable Long id) {
        if (articleService.deleteArticle(id)) {
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}