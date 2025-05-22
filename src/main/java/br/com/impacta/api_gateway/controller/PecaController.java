package br.com.impacta.api_gateway.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.impacta.api_gateway.dto.ComponenteDto;
import br.com.impacta.api_gateway.dto.PecaDto;
import br.com.impacta.api_gateway.dto.PecaMinDto;
import br.com.impacta.api_gateway.service.PecaService;

@RestController
@RequestMapping(path = "/api/v1/peca")
public class PecaController {

    private final PecaService pecaService;

    public PecaController(PecaService pecaService) {
        this.pecaService = pecaService;
    }

    @PostMapping
    public ResponseEntity<PecaMinDto> save(@RequestBody PecaMinDto dto) {
        dto = pecaService.savePeca(dto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{/id}")
                .buildAndExpand(dto.getId())
                .toUri();

        return ResponseEntity.created(uri).body(dto);
    }

    @PostMapping("/{codigo}/componente")
    public ResponseEntity<ComponenteDto> adicionarComponente(
            @PathVariable String codigo,
            @RequestBody ComponenteDto dto) {

        dto = pecaService.saveComponente(codigo, dto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{/id}")
                .buildAndExpand(dto.getId())
                .toUri();

        return ResponseEntity.created(uri).body(dto);
    }

    @GetMapping(path = "/{codigo}")
    public ResponseEntity<PecaDto> findByCodigo(@PathVariable String codigo) {
        PecaDto dto = pecaService.findByCodigo(codigo);

        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<List<PecaMinDto>> findAll() {
        List<PecaMinDto> dto = pecaService.findAll();

        return ResponseEntity.ok(dto);
    }

    @GetMapping(path = "/{codigo}/componente")
    public ResponseEntity<List<ComponenteDto>> findAllByCodigo(@PathVariable String codigo) {
        List<ComponenteDto> dto = pecaService.findAllByCodigo(codigo);

        return ResponseEntity.ok(dto);
    }

}
